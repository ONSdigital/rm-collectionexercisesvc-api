[![Codacy Badge](https://api.codacy.com/project/badge/Grade/03596519a2dd45f1a8e944d70b179f96)](https://www.codacy.com/app/sdcplatform/rm-collectionexercisesvc-api?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ONSdigital/rm-collectionexercisesvc-api&amp;utm_campaign=Badge_Grade)
[![Build Status](https://travis-ci.org/ONSdigital/rm-collectionexercisesvc-api.svg?branch=master)](https://travis-ci.org/ONSdigital/rm-collectionexercisesvc-api)
[![codecov](https://codecov.io/gh/ONSdigital/rm-collectionexercisesvc-api/branch/master/graph/badge.svg)](https://codecov.io/gh/ONSdigital/rm-collectionexercisesvc-api)

# Collection Exercise Service API

This is the API component of the CTP Collection Exercise Service - it contains the DTO types used in the public API.

# Creating a release artifact
There are no additional steps required to generate a release artifact. Travis takes care of all of this.

## When is a release artifact generated
A release artifact is generated by travis when the branch you are working on has been merged back. 

## What does travis do when my code is merged back
1. Travis will do a `mvn -B test`. This will build and test the code as usual
1. Travis will run `mvn -B release:prepare` which will prepare the project to be released
1. Travis will run `mvn -B release:perform` which will create a release artifact and bump the version ready for development again

## What does the version bump look like?
If you are developing on version `0.0.1-SNAPSHOT` `mvn -B release:prepare` and `mvn -B release:perform` will create an artifact of version `0.0.1` in artifactory and bump the version to `0.0.2-SNAPSHOT` ready for the next changes to worked on and released.

## Copyright
Copyright (C) 2017 Crown Copyright (Office for National Statistics)
