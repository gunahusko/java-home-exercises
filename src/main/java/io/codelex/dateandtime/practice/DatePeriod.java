package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate startDate;
    private final LocalDate endDate;

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public DatePeriod intersection(DatePeriod secondDate) {
        if (startDate.isBefore(secondDate.startDate) &&
            endDate.isAfter(secondDate.startDate) &&
            endDate.isBefore(secondDate.endDate)) {
            return _1overlapStartOf2(secondDate);

        } else if (startDate.isAfter(secondDate.startDate) &&
                   startDate.isBefore(secondDate.endDate) &&
                   endDate.isAfter(secondDate.endDate)) {
                   return _1overlapEndOf2(secondDate);

        } else if (startDate.isBefore(secondDate.startDate) &&
                   endDate.isAfter(secondDate.endDate)) {
                   return secondStartSecondEnd(secondDate);

        } else if (startDate.isAfter(secondDate.startDate) &&
                   endDate.isBefore(secondDate.endDate)) {
                   return thisStartThisEnd();

        } else if (endDate.isEqual(secondDate.startDate)) {
                   return equal1EndWith2Start(secondDate);

        } else if (startDate.isEqual(secondDate.endDate)) {
                   return equal2EndWith1Start(secondDate);

        } else if (startDate.isEqual(secondDate.startDate) &&
                   endDate.isBefore(secondDate.endDate)) {
                   return thisStartThisEnd();

        } else if (startDate.isAfter(secondDate.startDate) &&
                   endDate.isEqual(secondDate.endDate)) {
                   return thisStartThisEnd();

        } else if (startDate.isEqual(secondDate.startDate) &&
                   endDate.isEqual(secondDate.endDate)) {
                   return thisStartThisEnd();

        } else if (startDate.isEqual(secondDate.startDate) &&
                   endDate.isAfter(secondDate.endDate)) {
                   return secondStartSecondEnd(secondDate);

        } else if (startDate.isBefore(secondDate.startDate) &&
                   endDate.isEqual(secondDate.endDate)) {
                   return secondStartSecondEnd(secondDate);

        } else {
            return null;
        }
    }

    private DatePeriod _1overlapStartOf2(DatePeriod secondDate) {
        return new DatePeriod(secondDate.startDate, endDate);
    }

    private DatePeriod _1overlapEndOf2(DatePeriod secondDate) {
        return new DatePeriod(startDate, secondDate.endDate);
    }

    private DatePeriod secondStartSecondEnd(DatePeriod secondDate) {
        return new DatePeriod(secondDate.startDate, secondDate.endDate);
    }

    private DatePeriod thisStartThisEnd() {
        return new DatePeriod(startDate, endDate);
    }

    private DatePeriod equal1EndWith2Start(DatePeriod secondDate) {
        return new DatePeriod(endDate, secondDate.startDate);
    }

    private DatePeriod equal2EndWith1Start(DatePeriod secondDate) {
        return new DatePeriod(secondDate.endDate, startDate);
    }

    @Override
    public String toString() {
        return "start: " + startDate +
                ", end: " + endDate;
    }
}
