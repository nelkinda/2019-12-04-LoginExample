package backend

import (
	"./api_test"
	"./unit_test"
	"os"
	"testing"
)

func TestMain(m *testing.M) {
	status := 0
	if st := api_test.ApiTest(); st > status {
		status = st
	}
	if st := unit_test.UnitTest(); st > status {
		status = st
	}
	if st := m.Run(); st > status {
		status = st
	}
	os.Exit(status)
}
