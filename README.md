# CoderHack Leaderboard Management System
This project is a RESTful API service developed using SpringBoot to manage the leaderboard for a coding platform.
It uses MongoDB to persist the data.

## Problem Statement
The goal of this project is to design a service for managing the leaderboard of a specific contest on a coding platform.
The platform has only one contest with a single leaderboard.
Users can register, update their score and view the leaderboard.

## Requirements
- Handle CRUD operations for competing user registrations
- Award badges based on user scores
- Sort user retrieval based on scores
- Implement validation and error handling
- Publish code to a public GitHub repository with descriptive README

## Endpoints
- `GET /users`: Retrieve a list of all registered users
- `GET /users/{userId}`: Retrieve the details of specific user
- `POST /users`: Register a new user to the contest
- `PUT /users/{userId}`: Update the score of a specific user
- `DELETE /users/{userId}`: Deregister a specific user from the contest

## Installation and Setup
1. Clone the repository:
  `git clone https://github.com/harprit-83192/CoderHack.git`
2. Navigate to the project directory:
   `cd CoderHack'
3. Build the project using Maven:
  `mvn clean install`
4. Run the application:
  `mvn spring-boot:run`
5. The application will start on `http://localhost:8080`.

## Usage
You can use tools like cURL or Postman to interact with API endpoints.

## Postman Collection
`{
	"id": "4d77c4f3-0cc3-4a5e-9127-df78b7bfeb76",
	"name": "CoderHackLeaderboard",
	"timestamp": "2024-03-20T11:29:12.536Z",
	"collection_id": "33745963-67ad47b3-c85f-40cb-a091-d21683d0de11",
	"folder_id": 0,
	"environment_id": "0",
	"totalPass": 0,
	"delay": 0,
	"persist": true,
	"status": "finished",
	"startedAt": "2024-03-20T11:28:53.756Z",
	"totalFail": 0,
	"results": [
		{
			"id": "51794b8f-8039-4062-b4a4-3b0112715ed4",
			"name": "http://localhost:8080/users",
			"url": "http://localhost:8080/users",
			"time": 3716,
			"responseCode": {
				"code": 201,
				"name": "Created"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				3716
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "64cb5a53-0a0d-4388-bc1c-0c7369c1434a",
			"name": "http://localhost:8080/users",
			"url": "http://localhost:8080/users",
			"time": 1190,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				1190
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "256b8058-f121-4b77-93ed-3eabafed9bd8",
			"name": "http://localhost:8080/users/1",
			"url": "http://localhost:8080/users/1",
			"time": 2947,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				2947
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "49ec8945-696b-47b1-ab52-d40446612abd",
			"name": "http://localhost:8080/users/1?score=55",
			"url": "http://localhost:8080/users/1?score=55",
			"time": 1889,
			"responseCode": {
				"code": 200,
				"name": "OK"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				1889
			],
			"allTests": [
				{}
			]
		},
		{
			"id": "a947ff9f-24d3-4d7b-b54b-375fba2de833",
			"name": "http://localhost:8080/users/1",
			"url": "http://localhost:8080/users/1",
			"time": 5775,
			"responseCode": {
				"code": 204,
				"name": "No Content"
			},
			"tests": {},
			"testPassFailCounts": {},
			"times": [
				5775
			],
			"allTests": [
				{}
			]
		}
	],
	"count": 1,
	"totalTime": 15517,
	"collection": {
		"requests": [
			{
				"id": "51794b8f-8039-4062-b4a4-3b0112715ed4",
				"method": "POST"
			},
			{
				"id": "64cb5a53-0a0d-4388-bc1c-0c7369c1434a",
				"method": "GET"
			},
			{
				"id": "256b8058-f121-4b77-93ed-3eabafed9bd8",
				"method": "GET"
			},
			{
				"id": "49ec8945-696b-47b1-ab52-d40446612abd",
				"method": "PUT"
			},
			{
				"id": "a947ff9f-24d3-4d7b-b54b-375fba2de833",
				"method": "DELETE"
			}
		]
	}
}`
