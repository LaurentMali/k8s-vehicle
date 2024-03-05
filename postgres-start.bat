@echo off

cd db-postgres || exit /b
docker-compose -f docker-compose-postgres.yml up -d
