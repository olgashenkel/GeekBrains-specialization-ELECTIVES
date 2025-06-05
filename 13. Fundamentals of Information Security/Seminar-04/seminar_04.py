import hashlib

data = b'Test hash'
hash = hashlib.sha256(data)
print(hash.hexdigest())