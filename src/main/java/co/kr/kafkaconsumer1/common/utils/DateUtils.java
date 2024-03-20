package co.kr.kafkaconsumer1.common.utils;

import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;


public class DateUtils {

    public Instant getInstantNow(){
        return Instant.now();
    }

    public Date getInstantNowToDate(){
        return Instant.now().toDate();
    }

    public String timestampToDateTime(Long timestamp , String sormatPattern){
        DateTimeFormatter dtf = DateTimeFormat.forPattern(sormatPattern);
        DateTime dateTime = new DateTime(timestamp);
        return dateTime.toString(dtf);
    }

}
