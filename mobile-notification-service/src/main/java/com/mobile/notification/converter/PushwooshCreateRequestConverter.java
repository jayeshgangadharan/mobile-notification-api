package com.mobile.notification.converter;

import com.mobile.notification.dto.Notification;
import com.mobile.notification.dto.pushwoosh.PushwooshRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Dozer would be an excellent option for this but this would be easier when we add more attributes
 * User: Jayesh
 * Date: 7/21/15
 * Time: 8:39 PM
 */
@Component
public class PushwooshCreateRequestConverter implements Converter<Notification, PushwooshRequest> {

    @Override
    public PushwooshRequest convert(Notification notification) {
        PushwooshRequest pushRequest = new PushwooshRequest();
        return pushRequest;
    }
}
