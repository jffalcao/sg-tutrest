# Building REST services with Spring

Part of the Spring guide tutorials

## Tutorial Links:

- Spring.io: https://spring.io/guides/tutorials/rest/
- Github: https://github.com/spring-guides/tut-rest

---

## Source code 

- Create a new Github project
- Add to local structure ~/<workspace>/github/sg-tutrest/

## Running and test the different RPC Endpoints of the application

### Running
```
./mvnw clean spring-boot:run
```

### GET endpoints for employees
```
curl -v localhost:8080/employees
curl -v localhost:8080/employees/2
```

### Error 404
```
curl -v localhost:8080/employees/99
```

### POST new employee
```
curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "gardener"}'
```

### PUT a new employee
```
curl -X PUT localhost:8080/employees/99 -H 'Content-type:application/json' -d '{"name": "Gandalf", "role": "Wizard"}'
```

### PUT Modify an existing employee
```
curl -X PUT localhost:8080/employees/3 -H 'Content-type:application/json' -d '{"name": "Samwise Gamgee", "role": "ring bearer"}'
```

### DELETE an employee
```
curl -X DELETE localhost:8080/employees/2
```
