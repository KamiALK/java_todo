package com.example.domain.ports.in;

import com.example.domain.models.AditionalTaskInfo;


public interface GetAditionalTaskInfoUseCase {
  AditionalTaskInfo getAditionalTaskInfo(Long id);
}
