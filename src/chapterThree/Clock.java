package chapterThree;

import java.time.Instant;
import java.time.ZoneId;

public class Clock {
    java.time.Clock clock = new java.time.Clock() {
        @Override
        public ZoneId getZone() {
            return null;
        }

        @Override
        public java.time.Clock withZone(ZoneId zone) {
            return null;
        }

        @Override
        public Instant instant() {
            return null;
        }

    };
}
