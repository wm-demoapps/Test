package com.wavemaker.test.onwavemaker.service;


import com.wavemaker.test.onwavemaker.model.*;
import com.wavemaker.test.onwavemaker.model.IntegerWrapper;
import com.wavemaker.test.onwavemaker.model.MarkOverdueEmisRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface QueryExecutionControllerService {

  /**
   * 
   * markOverdueEmis
    * @param body  (required)
   * @return IntegerWrapper
   */
  @RequestLine("PUT /loancorp/queryExecutor/queries/markOverdueEmis")
  @Headers({
    "Content-Type: */*",
    "Accept: */*",  })
  IntegerWrapper queryExecutionControllerExecuteMarkOverdueEmis(MarkOverdueEmisRequest body);

}
