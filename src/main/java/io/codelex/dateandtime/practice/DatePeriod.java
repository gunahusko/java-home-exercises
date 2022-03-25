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
        if (firstOverlapStartOf2(secondDate)) {
            return new DatePeriod(secondDate.startDate, endDate);

        } else if (firstOverlapEndOf2(secondDate)) {
            return new DatePeriod(startDate, secondDate.endDate);

        } else if (overlapAllOfSecondDatePeriod(secondDate)) {
            return new DatePeriod(secondDate.startDate, secondDate.endDate);

        } else if (overlapAllOfFirstDatePeriod(secondDate)) {
            return new DatePeriod(startDate, endDate);

        } else if (equalOneDay1EndWith2Start(secondDate)) {
            return new DatePeriod(endDate, secondDate.startDate);

        } else if (equalOneDay1StartWith2End(secondDate)) {
            return new DatePeriod(secondDate.endDate, startDate);

        } else {
            return null;
        }
    }

    private boolean firstOverlapStartOf2(DatePeriod secondDate) {
        return (startDate.isBefore(secondDate.startDate) && endDate.isAfter(secondDate.startDate) && endDate.isBefore(secondDate.endDate));
    }

    private boolean firstOverlapEndOf2(DatePeriod secondDate) {
        return (startDate.isAfter(secondDate.startDate) && startDate.isBefore(secondDate.endDate) && endDate.isAfter(secondDate.endDate));
    }

    private boolean overlapAllOfSecondDatePeriod(DatePeriod secondDate) {
        return (startDate.isBefore(secondDate.startDate) && endDate.isAfter(secondDate.endDate))
                || (startDate.isEqual(secondDate.startDate) && endDate.isAfter(secondDate.endDate))
                || (startDate.isBefore(secondDate.startDate) && endDate.isEqual(secondDate.endDate));
    }

    private boolean overlapAllOfFirstDatePeriod(DatePeriod secondDate) {
        return (startDate.isAfter(secondDate.startDate) && endDate.isBefore(secondDate.endDate))
                || (startDate.isEqual(secondDate.startDate) && endDate.isBefore(secondDate.endDate))
                || (startDate.isAfter(secondDate.startDate) && endDate.isEqual(secondDate.endDate))
                || (startDate.isEqual(secondDate.startDate) && endDate.isEqual(secondDate.endDate));
    }

    private boolean equalOneDay1EndWith2Start(DatePeriod secondDate) {
        return (endDate.isEqual(secondDate.startDate));
    }

    private boolean equalOneDay1StartWith2End(DatePeriod secondDate) {
        return (startDate.isEqual(secondDate.endDate));
    }

    @Override
    public String toString() {
        return "start: " + startDate +
                ", end: " + endDate;
    }
}
