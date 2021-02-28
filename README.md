# Fail test reporter maven plugin

This open source maven plugin will help people to publish information about failed test to the Jira. When test succeed
the issue in the Jira will be closed.

Shift Left is a practice intended to find and prevent defects early in the software delivery process and this maven
plugin will help you show you managers how many bugs will be closed by you with test.

## Usage

You can add this plugin to you project like this

```xml

<plugins>
    ...
    <plugin>
        <groupId>com.github.rodindenis</groupId>
        <artifactId>fail-test-reporter-maven-plugin</artifactId>
        <version>1.0-SNAPSHOT</version>
        <executions>
            <execution>
                <phase>test</phase>
                <goals>
                    <goal>fail-test-reporter</goal>
                </goals>
            </execution>
        </executions>
        <configuration>
            <report>target/cucumber-report.json</report>
        </configuration>
    </plugin>
    ...
</plugins>
```