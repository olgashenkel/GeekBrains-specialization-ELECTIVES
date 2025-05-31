import pandas as pd

# Загрузить CSV-файл в DataFrame
df = pd.read_csv('Перечень сформированных угроз.csv')

# Столбец 'Меры защиты' содержит значения, разделенные ';'
# Разделить столбец и развернуть его
df['Меры защиты'] = df['Меры защиты'].str.split(';')
df = df.explode('Меры защиты')

# Посчитать количество всех значений
total_count = df['Меры защиты'].size

# Посчитать количество уникальных значений
unique_count = df['Меры защиты'].nunique()

# Посчитать количество каждого значения
value_counts = df['Меры защиты'].value_counts()

# Создание DataFrame с результатами
results = pd.DataFrame({
    'Количество всех значений': total_count,
    'Количество уникальных значений': unique_count,
    'Код меры защиты': [row.split(' ')[0] for row in value_counts.index],
    'Наименование меры защиты': value_counts.index,
    'Количество баллов': value_counts
})

# Сортировка по убыванию количества баллов
results = results.sort_values(by='Количество баллов', ascending=False)

# Сохранение в Excel файл
output_file = 'Отсортированный перечень сформированных угроз.xlsx'
results.to_excel(output_file, index=False)

