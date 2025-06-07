'''
Задание №6 «Authentication and password management»

Вам нужно безопасно сохранить пароли пользователей (Authentication and password management)
'''
import hashlib

dict_users = {'user_1': 'password_1', 'user_2': 'password_2'}
for i in dict_users:
    dict_users[i] = hashlib.sha256(dict_users[i].encode()).hexdigest()
print(dict_users)
