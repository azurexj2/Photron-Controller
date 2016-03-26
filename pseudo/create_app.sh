#Pseudo command to demonstrate the ideas 


#create workspace for this data app 
orcli create workspace --name "prediction-app"

#create topic in kafka for receiving input stream
orcli create topic --name "prediction-topic" --workspace "prediction-app"

#create storage for this app
orcli create bucket --name "prediction-bucket" --workspace "prediction-app"
