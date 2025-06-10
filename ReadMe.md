Project Setup Guide

Overview
This guide provides the minimal steps required to set up the necessary components for this project: a PostgreSQL database using Docker and access to the API documentation via Swagger UI.

Prerequisites
Please ensure you have Docker installed on your system.

Docker: Installation Guide for Docker

Getting Started
1. Start the PostgreSQL Database
   Run the following command in your terminal to start the PostgreSQL database container:

docker run -p 5432:5432 --name some-postgres2 -e POSTGRES_PASSWORD=mysecretpassword -d postgres

This command will set up a PostgreSQL instance on port 5432 with the specified password, running in the background.

2. Access API Documentation (Swagger UI)
   Once your application (which utilizes this database and exposes the API) is running, you can access its interactive API documentation:

http://localhost:8081/swagger-ui/index.html

This URL should be opened in a web browser. Ensure your application is running and correctly serving Swagger UI on port 8081.