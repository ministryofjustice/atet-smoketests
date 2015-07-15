# atet-smoketests

## Running the tests

	mvn "-Dbase.url=<base.url>" "-Dcucumber.options=--tags @<environment> --tags ~@todo" -P experimental clean integration-test

where options are,
 
- ``<environment>=staging <base.url>=https://staging.et.dsd.io/apply``
- ``<environment>=experimental <base.url>=http://experimental.et.dsd.io/apply``

For example,

	mvn "-Dbase.url=http://experimental.et.dsd.io/apply" "-Dcucumber.options=--tags @experimental --tags ~@todo" -P experimental clean integration-test
