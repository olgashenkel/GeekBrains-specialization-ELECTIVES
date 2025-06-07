import nmap

def scan_network(target):
    # Создаем объект сканера
    nm = nmap.PortScanner()

    try:
        # Выполняем сканирование
        print(f"Сканирование {target} с параметроми -sS (сканирование TCP-подключений (TCP connect scan))...")
        nm.scan(hosts=target, arguments='-sS')

        # Печатаем результаты сканирования
        for host in nm.all_hosts():
            print('\n----------------------------')
            print('Анализ сканирования:')
            print('----------------------------')
            print(f'Хост: {host}')
            print(f'Состояние: {nm[host].state()}')

            for protocol in nm[host].all_protocols():
                print(f'Протокол: {protocol}')
                lport = nm[host][protocol].keys()
                for port in lport:
                    print(f'Порт: {port}\tСостояние: {nm[host][protocol][port]["state"]}')
    except Exception as e:
        print(f'Ошибка: {e}')


if __name__ == '__main__':
    target = input("Введите IP-адрес или диапазон IP-адресов для сканирования: ")
    scan_network(target)