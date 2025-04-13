import socket
import sys
import threading

# Choosing Nickname
nickname = input("Enter your nickname:\n")
# Обязательнный ввод никнейма
while nickname == '':
    nickname = input("Enter your nickname:\n")

# Connecting To Server
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Отработка возможных ошибок подключения
try:
    client.connect(('localhost', 55555))
except ConnectionRefusedError:
    print(
        "ConnectionRefusedError: [WinError 10061] Подключение не установлено, т.к. конечный компьютер отверг запрос на подключение")
    client.close()
    sys.exit()
except Exception as e:
    print(f"Ошибка подключения: {e}")
    client.close()
    sys.exit()


# Listening to Server and Sending Nickname
def receive():
    while True:
        try:
            # Receive Message From Server
            # If 'NICK' Send Nickname
            message = client.recv(1024).decode('utf-8')  # Замена кодировки ASCII на UTF-8
            if message == 'NICK':
                client.send(nickname.encode('utf-8'))  # Замена кодировки ASCII на UTF-8
            else:
                print(message)
        except Exception as e:
            # Close Connection When Error
            print(f"{e}")
            client.close()
            break


def write():
    while True:
        message = input('')
        if message.lower() == "esc":
            client.close()
            sys.exit()
        else:
            out_message = '{}: {}'.format(nickname, message)
            client.send(out_message.encode('utf-8'))  # Замена кодировки ASCII на UTF-8


# Starting Threads For Listening And Writing
receive_thread = threading.Thread(target=receive)
receive_thread.start()

write_thread = threading.Thread(target=write)
write_thread.start()
