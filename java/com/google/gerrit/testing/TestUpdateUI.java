// Copyright (C) 2017 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.testing;

import com.google.gerrit.server.schema.UpdateUI;
import com.google.gwtorm.server.OrmException;
import com.google.gwtorm.server.StatementExecutor;
import java.util.List;
import java.util.Set;

public class TestUpdateUI implements UpdateUI {
  @Override
  public void message(String message) {}

  @Override
  public boolean yesno(boolean defaultValue, String message) {
    return defaultValue;
  }

  @Override
  public void waitForUser() {}

  @Override
  public String readString(String defaultValue, Set<String> allowedValues, String message) {
    return defaultValue;
  }

  @Override
  public boolean isBatch() {
    return true;
  }

  @Override
  public void pruneSchema(StatementExecutor e, List<String> pruneList) throws OrmException {
    for (String sql : pruneList) {
      e.execute(sql);
    }
  }
}
