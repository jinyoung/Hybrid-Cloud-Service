# 

## Model
www.msaez.io/#/storming/1d8676486b5b0808d37cb200829cf8e6

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd kafka
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- Hybrid Cloud Service Design and Development
- External Cloud Service Integration and Management
- Security Management and Monitoring
- Customer Relationship Management
- Maintenance and Support Services


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- Hybrid Cloud Service Design and Development
```
 http :8088/hybridCloudServices Service ID="Service ID" Service Name="Service Name" Service Provider="Service Provider" Service Type="Service Type" Service Description="Service Description" 
```
- External Cloud Service Integration and Management
```
 http :8088/cloudServiceIntegrations Integration ID="Integration ID" Integration Name="Integration Name" Cloud Service Provider="Cloud Service Provider" Cloud Service Type="Cloud Service Type" Connection String="Connection String" Integration Status="Integration Status" 
```
- Security Management and Monitoring
```
 http :8088/securityPolicies Policy ID="Policy ID" Policy Name="Policy Name" Policy Description="Policy Description" Policy Enforcement="Policy Enforcement" Policy Type="Policy Type" 
```
- Customer Relationship Management
```
 http :8088/customers Customer ID="Customer ID" Customer Name="Customer Name" Customer Email="Customer Email" Customer Phone="Customer Phone" Customer Company="Customer Company" 
```
- Maintenance and Support Services
```
 http :8088/supportTickets Ticket ID="Ticket ID" Customer ID="Customer ID" Ticket Severity="Ticket Severity" Ticket Description="Ticket Description" Ticket Status="Ticket Status" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

