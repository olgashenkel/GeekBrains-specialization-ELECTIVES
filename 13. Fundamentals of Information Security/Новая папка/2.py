import nmap


def scan_network(target, arguments=''):
    # Создаем объект сканера
    nm = nmap.PortScanner()

    try:
        # Выполняем сканирование
        print(f"Сканирование {target} с параметрами '{arguments}'...")
        nm.scan(hosts=target, arguments=arguments)

        # Печатаем результаты сканирования
        for host in nm.all_hosts():
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
    target = input("Введите цель сканирования (например, 192.168.1.1/24 или example.com): ")
    arguments = input("Введите параметры для nmap (например, -sP для пинга): ")
    scan_network(target, arguments)