#!/bin/sh
BASE_URL = "http://localhost:8085";

echo "/health data\n";

# Make call to /health
URL = "$BASE_URL". "/endpoints/health"; 

echo $URL

curl --request GET \
  --url $URL

echo "/info data \n";
curl --request GET \
	--url '$BASE_URL'/endpoints/info





