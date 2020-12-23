package detect_capital

import (
	"fmt"
	"github.com/stretchr/testify/assert"
	"testing"
)

func Test_detectCapitalUse(t *testing.T) {
	type args struct {
		word string
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{
			name: "True값인 경우",
			args: args{word: "USA"},
			want: true,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := DetectCapitalUse(tt.args.word); got != tt.want {
				t.Errorf("DetectCapitalUse() = %v, want %v", got, tt.want)
			}
		})
	}
}

func Test_detectCapitalUse1(t *testing.T) {
	use := DetectCapitalUse("USA")
	fmt.Println("use", use)

}
