# Chua Yong Liang's Project Portfolio Page

### Project: InternTrack

## Overview

InternTrack streamlines the internship application chaos. It provides a fast CLI interface to log company contacts and application deadlines, ensuring students never miss a follow-up in a high-volume application season.

## Summary of Contributions

### Code Contributed

- [RepoSense link](https://nus-cs2113-ay2526-s2.github.io/tp-dashboard/?search=chuayongliang6&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2026-02-20T00%3A00%3A00&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&filteredFileName=)

### Enhancements Implemented

**New Features:**
- **Add Command**: Parser for adding applications with format `add c/COMPANY r/ROLE [d/DEADLINE] [ct/CONTACT]`. Implements flexible field parsing with comprehensive validation and error handling for invalid dates and missing required fields.
- **Remind Command**: Deadline reminder system that filters and displays applications due within a specified number of days (defaults to 7). Enables users to prioritize urgent applications.
- **Persistent Storage**: File-based persistence system that automatically saves and loads application data using a pipe-delimited text format, ensuring data is retained between sessions.

**Other Enhancements:**
- **Unit Testing**: Comprehensive test cases covering parsing logic, filtering, and storage functionality.
- **Logging & Error Handling**: Integrated Java logging with custom `InternTrackException` for user-friendly error messages.
- **Application Model**: Core `Application` class representing internship applications with company, role, deadline, contact, and status fields.
- **Command Dispatch System**: Routing for multiple commands (`add`, `remind`, `summary`, `bye`).

### Contributions to the UG

- Added comprehensive documentation for the `add `and `remind` command, including format, parameters, and usage examples with expected output

### Contributions to the DG

- **Storage Component**: Documented load/save sequences, file format specification and class diagram.
- **Add Feature**: Documented the command implementation with sequence diagram and detailed walkthrough of the parsing and storage workflow.
- **Remind Feature**: Documented the deadline filtering system including usage scenarios and edge case handling.

### Contributions to Team-Based Tasks

- Manage issue trackers by creating the issues at the start of v1.0 and v2.0
- Provided comprehensive testing guide in the DG including: (1) Launch and shutdown procedures and (2) Testing the data saving on the app

### Review/Mentoring Contributions

- PRs reviewed: [#9](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/9), [#18](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/18), [#20](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/20), [#25](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/25), [#31](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/31), [#34](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/34), [#38](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/38), [#39](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/39), [#40](https://github.com/AY2526S2-CS2113-W10-1/tp/pull/40)

### Contributions Beyond the Project Team

**Evidence of Helping Others:**

**Evidence of Technical Leadership:**
