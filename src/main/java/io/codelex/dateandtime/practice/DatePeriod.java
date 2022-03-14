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
        if (startDate.isBefore(secondDate.startDate) && endDate.isAfter(secondDate.startDate)) {
            return firstDateOverlapTheStartOfSecondDate(secondDate);
        } else if (startDate.isAfter(secondDate.startDate) && endDate.isAfter(secondDate.endDate)) {
            return firstDateOverlapTheEndOfSecondDate(secondDate);
        } else if (startDate.isBefore(secondDate.startDate) && endDate.isAfter(secondDate.endDate)) {
            return secondDate;
        } else if (startDate.isAfter(secondDate.startDate) && endDate.isBefore(secondDate.endDate)) {
            return secondDateOverlapFirstDate(secondDate);
        } else {
            return null;
        }
    }

    private DatePeriod firstDateOverlapTheStartOfSecondDate(DatePeriod secondDate) {
        return new DatePeriod(secondDate.startDate, secondDate.endDate);
    }

    private DatePeriod firstDateOverlapTheEndOfSecondDate(DatePeriod secondDate) {
        return new DatePeriod(startDate, endDate);
    }

    private DatePeriod secondDateOverlapFirstDate(DatePeriod secondDate) {
        return new DatePeriod(startDate, endDate);
    }


    @Override
    public String toString() {
        return "DatePeriod: startDate = " + startDate +
                ", endDate = " + endDate;
    }
}
