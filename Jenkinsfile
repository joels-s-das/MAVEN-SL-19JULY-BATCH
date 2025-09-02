pipeline
{
	agent any
	tools{
		maven "MAVEN_HOME"
	}
	stages {
		stage ('welcome stage'){
			steps 
			{
				echo " welcome to jenkin pipeline"
			}
		)
		stage ('clean stage') {
			steps{
				bat 'mavem clean'
			}
		}
		stage ('Build stage') {
			steps {
				echo 'buid ssuccessfull '
				}
		}
}