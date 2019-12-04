.PHONY: start
start:
	docker run --name login-frontend -d -p $(PORT):80 --mount type=bind,source="$(CURDIR)",target=/var/www/html php:apache

.PHONY: stop
stop:
	docker stop login-frontend
	docker rm login-frontend
