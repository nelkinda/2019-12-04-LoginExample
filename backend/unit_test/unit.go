package unit_test

import "github.com/DATA-DOG/godog"

var unitOpt = godog.Options{
	Tags:   "",
	Format: "progress",
	Paths:  []string{"../features"},
}

func UnitFeatureContext(suite *godog.Suite) {
}

func UnitTest() int {
	return godog.RunWithOptions("login", UnitFeatureContext, unitOpt)
}

