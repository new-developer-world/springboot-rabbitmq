Steps to install the rabbitmq
1.Download and install ERlang http://erlang.org/download/otp_win64_22.3.exe

2.Downlaod and install RabbitMQ https://github.com/rabbitmq/rabbitmq-server/releases/download/v3.8.8/rabbitmq-server-3.8.8.exe

3.Go to RabbitMQ Server install Directory C:\Program Files\RabbitMQ Server\rabbitmq_server-3.8.3\sbin

4.Run command rabbitmq-plugins enable rabbitmq_management.

5.Open browser and enter http://localhost:15672/ to redirect to RabbitMQ Dashboard.

6.Also we can Open it with IP Address http://127.0.0.1:15672.

7.If getting rabbitmq localhost refused to connect windows then do the following steps

  7.1 rabbitmq-service remove

  7.2 rabbitmq-service install

  7.3 rabbitmq-service enable

  7.4 rabbitmq-service.bat start

8.Login page default username and password is guest
