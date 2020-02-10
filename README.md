## Sample Spring Batch Application which demonstraits processing a csv file into DB
This is a result of a research done on "How to Deploy a Srping Batch Operation on OpenShift and Execute it periodically using a CronJob".
The other related codebase resides at "https://github.com/samme4life/openshift-cronjob"
This codebase is to implement a basic spring batch operation. The job launcher is called upon as a REST endpoint (/load)

## Reference

* The instructions on this application found here: "https://www.youtube.com/watch?v=1XEX-u12i0A&list=PLGVPYDuhQp5INh38gIrWWW9xeYrWuIYYB&index=3&t=2028s"
* Related DockerHub Images can be found here: "https://hub.docker.com/repository/docker/samme4life/spring-batch/general"
	
## How to Create the Docker image and push it into DockerHub

### Prerequisits
* Maven is configured in your system
* Docker should be installed in your PC
### Steps
* using command prompt go to the root of the application and themvn clean package 
* mvn clean package 
* docker build -t spring-batch-example .
* docker tag spring-batch-example <hub_user>/<repo_name>[:<tag>]
* docker push <hub_user>/<repo_name>[:<tag>]
