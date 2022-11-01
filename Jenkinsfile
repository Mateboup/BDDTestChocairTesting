#!groovy

pipeline {

    agent any

    parameters {
        string(name: 'branch',
               defaultValue: 'master',
               description: 'Ingrese el branch/feature:')
        string(name: 'runner',
               defaultValue: '*',
               description: 'Ingrese el nombre del runner:')
    }

    stages {

        stage ('Git Checkout') {
            agent {
                    label "Slave_Visuales_Core_04"
            }

            steps {
                git branch: "${branch}", credentialsId: '', url: 'https://github.com/Mateboup/BDDTestChocairTesting.git'
                stash name: 'TestArtifact', includes: '**/*'
            }
        }

        stage('Run Tests') {
        parallel {
            stage ('Run Test 1') {

                agent {
                    label "Slave_Visuales_Core_04"
                }

                steps {
                    unstash 'TestArtifact'
                    script {

                        if("$runner"==""){
                            bat "gradlew clean test --info"
                        }else{
                            bat "gradlew clean test --tests co.com.chocairtesting.certification.test.runners.${runner} aggregate -i"
                        }
                        bat 'DIR ' + pwd()
                    }
                }

                post {
                    always {
                        junit '**/target/site/serenity/SERENITY-JUNIT-*.xml'
                        publishHTML([reportName : 'Reporte Serenity 1',
                                    reportTitles: 'Reporte Serenity 1',
                                    reportDir:   './target/site/serenity',
                                    reportFiles: 'index.html',
                                    keepAll: true,
                                    alwaysLinkToLastBuild: true,
                                    allowMissing: false
                        ])
                    }

                }
            }

            stage ('Run Test 2') {

                agent {
                    label "Slave_Visuales_Core_03"
                }

                steps {
                    echo "Test"
                    /*
                    unstash 'TestArtifact'
                    script {

                        if("$runner"==""){
                            bat "gradlew clean test --info"
                        }else{
                            bat "gradlew clean test --tests co.com.chocairtesting.certification.test.runners.${runner} aggregate -i"
                        }
                        bat 'DIR ' + pwd()
                    }*/
                }

            }
        }
        }

    }
}