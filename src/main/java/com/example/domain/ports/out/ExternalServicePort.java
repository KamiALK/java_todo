
package com.example.domain.ports.out;

import com.example.domain.models.AditionalTaskInfo;

public interface ExternalServicePort {

    AditionalTaskInfo getAditionalTaskInfo(Long taskId);
}
