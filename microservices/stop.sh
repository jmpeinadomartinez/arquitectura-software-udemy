docker-compose down
docker rmi eureka-server:latest
docker rmi api-gateway:latest
docker rmi user-service:latest
docker rmi product-service:latest
docker rmi order-service:latest
docker rmi postgres:15.6-alpine