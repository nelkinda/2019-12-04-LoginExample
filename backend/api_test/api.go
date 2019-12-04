package api_test

import "github.com/DATA-DOG/godog"

var apiOpt = godog.Options{
	Tags:   "",
	Format: "progress",
	Paths:  []string{"../features"},
}

func ApiFeatureContext(suite *godog.Suite) {
}

func ApiTest() int {
	return godog.RunWithOptions("login", ApiFeatureContext, apiOpt)
}
