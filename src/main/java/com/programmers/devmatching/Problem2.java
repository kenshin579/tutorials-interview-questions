package com.programmers.devmatching;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * https://www.geeksforgeeks.org/program-convert-time-12-hour-24-hour-format/
 */
@Slf4j
@Deprecated
public class Problem2 {
    public String solution(String p, int n) {
        String[] s = p.split(" ");
        String amPmStr = s[0];
        String timeStr = s[1];

        String[] timeSplit = timeStr.split(":");

        Clock clock = new Clock(amPmStr, Integer.parseInt(timeSplit[0]),
                Integer.parseInt(timeSplit[1]),
                Integer.parseInt(timeSplit[2]));

        clock.plusSeconds(n);
        return clock.convertTo24Format();
    }

    class Clock {
        private String amPm;
        private int hour;
        private int minute;
        private int seconds;

        public Clock(String amPm, int hour, int minute, int seconds) {
            this.amPm = amPm;
            this.hour = hour;
            this.minute = minute;
            this.seconds = seconds;
        }

        public String getHourStr() {
            if (this.hour < 10) {
                return String.format("0%s", this.hour);
            }
            return String.valueOf(this.hour);
        }

        public String getMinuteStr() {
            if (this.minute < 10) {
                return String.format("0%s", this.minute);
            }
            return String.valueOf(this.minute);
        }

        public String getSecondStr() {
            if (this.seconds < 10) {
                return String.format("0%s", this.seconds);
            }
            return String.valueOf(this.seconds);
        }

        public void plusSeconds(int plusSecond) {
            int totalSeconds = this.hour * 3600 + this.minute * 60 + this.seconds + plusSecond;

            long hours = TimeUnit.SECONDS.toHours(totalSeconds);
            long minute = TimeUnit.SECONDS.toMinutes(totalSeconds) - (TimeUnit.SECONDS.toHours(totalSeconds) * 60);
            long second = TimeUnit.SECONDS.toSeconds(totalSeconds) - (TimeUnit.SECONDS.toMinutes(totalSeconds) * 60);

            this.hour = (int) hours;
            this.minute = (int) minute;
            this.seconds = (int) second;
        }

        public String convertTo24Format() {
            String hour = getHourStr();
            if (amPm.equals("PM")) {
                hour = String.valueOf(this.hour + 12);
                if (hour.equals("24")) {
                    hour = "00";
                }
            }
            return String.format("%s:%s:%s", hour, getMinuteStr(), getSecondStr());
        }

        @Override
        public String toString() {
            return "Clock{" +
                    "amPm='" + amPm + '\'' +
                    ", hour=" + hour +
                    ", minute=" + minute +
                    ", seconds=" + seconds +
                    '}';
        }
    }
}
