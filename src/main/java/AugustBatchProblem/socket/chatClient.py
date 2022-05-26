import socket

host = 'localhost'
port = 9000


s = socket.socket()

s.connect((host, port))

str = input("Enter data")

while str != 'exit':
    s.send(str.encode())
    data = s.recv(1024)
    data = data.decode()

    print("from server"+ data)

    str = input("Enter data")

s.close()