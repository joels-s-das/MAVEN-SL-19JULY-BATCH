pipeline
{
	agent any
	tools{
		maven "MAVEN_HOME"
	}
	stages {
		stage ('Welcome Stage'){
			steps 
			{
				echo " welcome to jenkin pipeline"
			}
		}
		stage ('Clean Stage') {
			steps{
				bat 'mvn clean'
			}
		}
		stage ('Build Success') {
			steps {
				echo 'Buid Successfull '
				}
		}
	}
}