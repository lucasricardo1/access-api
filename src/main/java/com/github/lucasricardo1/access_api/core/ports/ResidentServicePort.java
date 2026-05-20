package com.github.lucasricardo1.access_api.core.ports;

import com.github.lucasricardo1.access_api.core.domain.Resident;

public interface ResidentServicePort {

    Resident createResident(Resident resident);
}
