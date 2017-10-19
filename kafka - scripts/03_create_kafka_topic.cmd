::SET KAFKA_PATH=C:\dev\kafka_2.12-0.11.0.1

%KAFKA_PATH%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test