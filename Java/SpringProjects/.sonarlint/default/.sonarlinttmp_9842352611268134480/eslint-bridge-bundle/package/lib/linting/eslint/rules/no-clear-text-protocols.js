"use strict";
/*
 * SonarQube JavaScript Plugin
 * Copyright (C) 2011-2023 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
// https://sonarsource.github.io/rspec/#/rspec/S5332/javascript
Object.defineProperty(exports, "__esModule", { value: true });
exports.rule = void 0;
const helpers_1 = require("./decorators/helpers");
const no_clear_text_protocols_lib_1 = require("./no-clear-text-protocols.lib");
const no_clear_text_protocols_aws_1 = require("./no-clear-text-protocols.aws");
exports.rule = {
    meta: {
        messages: { ...no_clear_text_protocols_lib_1.rule.meta.messages, ...no_clear_text_protocols_aws_1.rule.meta.messages },
    },
    create(context) {
        return (0, helpers_1.mergeRules)(no_clear_text_protocols_lib_1.rule.create(context), no_clear_text_protocols_aws_1.rule.create(context));
    },
};
//# sourceMappingURL=no-clear-text-protocols.js.map