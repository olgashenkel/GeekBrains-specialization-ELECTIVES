import socket
import threading
from time import sleep

# Создание сокета с сайтом Яндекс
ya_sock = socket.socket()
addr = ('77.88.55.242', 443)
ya_sock.connect(addr)

# Отправка запроса на сайт Яндекс
data_out = b"GET / HTTP/1.1\r\nHost:ya.ru\r\n\r\n"
ya_sock.send(data_out)

# Получение ответа на запрос с сайта Яндекс
# data_in = ya_sock.recv(1024)
# print(data_in)
# data_in = ya_sock.recv(1024)
# print(data_in)
# data_in = ya_sock.recv(1024)
# print(data_in)
# data_in = ya_sock.recv(1024)
# print(data_in)

# Получение ответа на запрос с сайта Яндекс в виде бесконечного цикла и с помощью функции
data_in = b''


def recieving():
    global data_in
    while True:
        data_chunk = ya_sock.recv(1024)
        data_in = data_in + data_chunk


rec_thread = threading.Thread(target=recieving)
rec_thread.start()

sleep(4)
print(data_in)
ya_sock.close()