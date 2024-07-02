package com.socoolheeya.travel.app.internal.api.core.property.service;

import com.socoolheeya.travel.domain.rds.main.property.service.command.PropertyImageCommandService;
import com.socoolheeya.travel.domain.rds.main.property.service.query.PropertyImageQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyImageService {

    private final PropertyImageQueryService propertyImageQueryService;
    private final PropertyImageCommandService propertyImageCommandService;

    public void deleteByPropertyId(Long propertyId) {
        propertyImageCommandService.deleteByPropertyId(propertyId);
    }


}
