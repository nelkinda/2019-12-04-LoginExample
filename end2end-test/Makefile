.PHONY: test
test: ./mvnw
	./mvnw -q verify

./mvnw:
	mvn -N io.takari:maven:0.7.6:wrapper -Dmaven=3.6.3

-include User.mk
-include ../User.mk
-include ~/User.mk
