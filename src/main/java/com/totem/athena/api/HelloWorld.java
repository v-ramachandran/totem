package com.totem.athena.api;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.SpeechletResponse;

public class HelloWorld {
  public String testHandler(IntentRequest sample, Context context) {
    return sample.getIntent().getSlot("Message").getValue() + " response";
  }
}
