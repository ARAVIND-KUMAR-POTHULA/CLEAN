import java.time.*
import java.time.format.DateTimeFormatter
def day 
def set
def gv
pipeline {
  agent any
  stages {
   
    stage('UnlinkPromotheus')
    {
        steps
        {
             script {
                   gv = load "script.groovy" 
                   set = gv.getSet()
                }

            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'UnlinkPromotheus'), string(name: 'SetName', value: set)]
        }
    }
    stage('AddPackage')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'AddPackage'), string(name: 'SetName', value: set)]
        }
    }
    stage('Buildverification')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'Buildverification'), string(name: 'SetName', value: set)]
        }
    }
    stage('SetPrerequisites')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'SetPrerequisites'), string(name: 'SetName', value: set)]
        }
    }
    stage('AddClusters')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'AddClusters'), string(name: 'SetName', value: set)]
        }
    }
    stage('Redis')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'Redis'), string(name: 'SetName', value: set)]
        }
    }
    stage('AddTenants')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'AddTenants'), string(name: 'SetName', value: set)]
        }
    }
    stage('Generatepassword')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'Generatepassword'), string(name: 'SetName', value: set)]
        }
    }
    stage('Motomo')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'Motomo'), string(name: 'SetName', value: set)]
        }
    }
    stage('Rabbitmq')
    {
        steps
        {
            build job: 'testingjob1',parameters: [string(name: 'cd_workflow', value: 'Rabbitmq'), string(name: 'SetName', value: set)]
        }
    }
  }
}
