--[[
    Solving the reverse problem
    https://open.kattis.com/problems/ofugsnuid
]]--

local function reverse(t)
    local n = #t
    local i = 1
    for i = n - 1, 1, -1 do
        t[n] = table.remove(t, i)
    end
end

local count = io.read("n")

local i = 1
local nums = {}

while i <= count do
    nums[i] = io.read("n")
    i = i + 1
end

reverse(nums)

for _, value in ipairs(nums) do
    print(value)
end