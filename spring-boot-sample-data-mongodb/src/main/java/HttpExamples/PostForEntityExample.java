package HttpExamples;

public class PostForEntityExample {

  private class VehicleType {

    private String ispName;

    public String getIspName() {
      return ispName;
    }

    public void setIspName(String ispName) {
      this.ispName = ispName;
    }
  }

//      private void invokeProcessorDispatcher(Set<VehicleType> vehicleTypes) {
//        Set<String> results = new HashSet<>();
//        Iterator<VehicleType> itr = vehicleTypes.iterator();
//        while (itr.hasNext()) {
//          VehicleType value = itr.next();
//          LOGGER.info("Value" + value);
//          if ("Fund".equals(value.getIspName()) || "US".equals(value.getIspName())) {
//            results.add(value.getIspName());
//            LOGGER.info("RESULTS" + results);
//          }
//        }
//        try {
//          HttpHeaders headers = new HttpHeaders();
//
//          headers.setContentType(
//              org.springframework.http.MediaType.APPLICATION_JSON);
//
//          Map<String, String> requestBody = new HashMap<>();
//
//          HttpEntity<Set<String>>
//              request =
//              new HttpEntity<>(results, headers);
//
//          String
//              result = restTemplate
//              .postForObject("http://localhost:3000/dispatcher/service/api/message",
//                  results, String.class);
//        } catch (HttpClientErrorException e) {
//          LOGGER.error("Errors: " + e.getResponseBodyAsString());
//          ErrorHolder eh = objectMapper.readValue(e.getResponseBodyAsString(), ErrorHolder.class);
//          logger.error("error:  " + eh.getErrorMessage());
//          throw e;
//        }
//      }


}

