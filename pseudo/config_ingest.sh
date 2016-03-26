#create a spark cluster with 4 nodes
orcli spark create --name "prediction-cluster" -n 4 -jm 1024 -tm 2048

#submit streaming job
orcli spark run --workspace "prediction-app" /orchesio/ingest.jar
