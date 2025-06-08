import json
from pathlib import Path
from functools import reduce

# Функция mapper: извлекает оценку и вычисляет промежуточные значения
def mapper(path):
    n, mean, M2 = 0, 0.0, 0.0
    if path.is_file() and path.suffix == '.json':
        with open(path, 'r') as f:
            info = json.load(f)
        score = float(info['movieIMDbRating'])
        n += 1
        delta = score - mean
        mean += delta / n
        M2 += delta * (score - mean)
    return n, mean, M2

# Функция reducer: объединяет промежуточные результаты
def reducer(score_data1, score_data2):
    n1, mean1, M21 = score_data1
    n2, mean2, M22 = score_data2

    n = n1 + n2
    if n == 0:
        return 0, 0.0, 0.0

    delta = mean2 - mean1
    mean = mean1 + delta * n2 / n
    M2 = M21 + M22 + delta ** 2 * n1 * n2 / n

    return n, mean, M2

# Измерение времени выполнения всего кода
%%time

# Применяем mapper и объединяем результаты с помощью reducer
n, mean, M2 = reduce(reducer, map(mapper, Path('imdb-user-reviews').glob('**/*')))

# Выводим результат
if n > 0:
    print(f"Среднее: {mean}, Стандартное отклонение: {(M2 / n) ** (1/2)}")
else:
    print("Нет данных для обработки")