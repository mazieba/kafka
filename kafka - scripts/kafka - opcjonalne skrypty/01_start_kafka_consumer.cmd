::SET KAFKA_PATH=C:\dev\kafka_2.12-0.11.0.1

%KAFKA_PATH%\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning