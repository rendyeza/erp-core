package id.nexbyte.erp.core.mapper;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class DateMapper {
    public static OffsetDateTime localToOffset(LocalDateTime localDateTime) {
        if (localDateTime == null) return null;

        ZoneId zoneId = ZoneId.systemDefault();
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(localDateTime);
        return localDateTime.atOffset(zoneOffset);
    }

    public static LocalDateTime offsetToLocal(OffsetDateTime offsetDateTime) {
        return offsetDateTime.toLocalDateTime();
    }
}
