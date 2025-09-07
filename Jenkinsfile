pipeline
{
	agent any
	tools{
		maven "MAVEN_HOME"
	}
	stages {
		stage ('Welcome Stage')
		{
			steps 
			{
				echo " welcome to jenkin pipeline"
			}
		}
		stage ('Clean Stage') 
		{
			steps
			{
				//bat 'mvn clean'
				script {
					if (isUnix()) 
					{
						sh 'mvn clean'
					} 
					else 
					{
							bat 'mvn clean'
					}
        			}
			}
		}
		stage ('Test Stage')
		{
			steps 
			{
				sh 'mvn test'
			}
		}
		stage ('Build Stage')
		{
			steps
			{
				sh 'mvn package'
			}
			
		}
		stage ('Build Success')
		{
			steps 
			{
				echo 'Buid Successfull '
			}
		}
	}
}