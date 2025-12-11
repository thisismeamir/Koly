// ============================================================================
// NAMESPACE TEST CASES - All valid C++ namespace definition styles
// ============================================================================

// 1. BASIC NAMESPACE
namespace basic {
    int x = 1;
}

// 2. NESTED NAMESPACE (OLD STYLE - C++03)
namespace outer {
    namespace inner {
        int y = 2;
    }
}

// 3. NESTED NAMESPACE (NEW STYLE - C++17)
namespace compact::nested::deep {
    int z = 3;
}

// 4. ANONYMOUS/UNNAMED NAMESPACE
namespace {
    int secret = 4;
}

// 5. INLINE NAMESPACE (C++11)
inline namespace version1 {
    int api_version = 5;
}

// 6. NESTED INLINE NAMESPACE
namespace library {
    inline namespace v2 {
        int feature = 6;
    }
}

// 7. REOPENING A NAMESPACE (multiple definitions)
namespace basic {
    int another_var = 7;
}

// 8. NAMESPACE ALIAS
namespace alias_target {
    int value = 8;
}
namespace short_name = alias_target;

// 9. NESTED NAMESPACE ALIAS
namespace very::big::namespace_name {
    int data = 9;
}
namespace vln = very::big::namespace_name;

// 10. MIXING INLINE AND NESTED
namespace root {
    inline namespace current {
        namespace detail {
            int impl = 10;
        }
    }
}

// 11. NAMESPACE WITH INLINE NESTED (C++17 style)
namespace project::inline_ns::nested {
    int combined = 11;
}

// 12. ANONYMOUS NAMESPACE INSIDE NAMED NAMESPACE
namespace container {
    namespace {
        int hidden = 12;
    }
}

// 13. MULTIPLE ANONYMOUS NAMESPACES (each is unique)
namespace section_a {
    namespace {
        int local_a = 13;
    }
}
namespace section_b {
    namespace {
        int local_b = 14;  // Different from local_a's anonymous namespace
    }
}

// 14. NAMESPACE WITH ATTRIBUTES (C++17)
namespace [[deprecated]] old_api {
    int legacy = 15;
}

// 15. NAMESPACE WITH MULTIPLE ATTRIBUTES
namespace [[gnu::visibility("default")]] [[deprecated("Use new_api instead")]] old_stuff {
    int compat = 16;
}

// 16. DEEPLY NESTED MIXED STYLE
namespace level1 {
    namespace level2::level3 {
        namespace level4 {
            inline namespace level5 {
                int deep = 17;
            }
        }
    }
}

// 17. NAMESPACE REOPENING WITH DIFFERENT NESTING LEVELS
namespace reopen {
    int first = 18;
}
namespace reopen::nested {
    int second = 19;
}
namespace reopen {
    int third = 20;
}

// 18. EXTERN "C" WITH NAMESPACE (special case)
extern "C" {
    namespace c_compat {
        int bridge = 21;
    }
}

// 19. NAMESPACE ALIAS TO NESTED NAMESPACE
namespace target::nested::deep {
    int value = 22;
}
namespace tnd = target::nested::deep;

// 20. NAMESPACE ALIAS CHAIN
namespace original {
    int val = 23;
}
namespace alias1 = original;
namespace alias2 = alias1;

// 21. INLINE NAMESPACE IN C++17 NESTED STYLE
namespace app::v3 {
    int version = 24;
}

// 22. COMPLEX REAL-WORLD PATTERN
namespace company::product::inline v2::detail {
    namespace {
        int internal = 25;
    }
}

// 23. NAMESPACE WITH TEMPLATE INSIDE (namespace defines scope for template)
namespace templates {
    template<typename T>
    struct Container {
        T value;
    };
}

// 24. STD-LIKE PATTERN (inline namespace versioning)
namespace mylib {
    inline namespace v1 {
        namespace detail {
            int impl_v1 = 26;
        }
    }
    namespace v2 {
        namespace detail {
            int impl_v2 = 27;
        }
    }
}

// 25. NAMESPACE WITH USING DIRECTIVE (doesn't create new namespace but uses it)
namespace util {
    int helper = 28;
}
// Not a namespace definition, but your parser might encounter it:
// using namespace util;

// ============================================================================
// EDGE CASES YOUR PARSER SHOULD HANDLE
// ============================================================================

// NOTE: These are NOT new namespace definitions, but syntactic constructs
// that might confuse a naive parser:

// Using declaration (NOT a namespace)
// using util::helper;

// Type alias (NOT a namespace)
// using MyInt = int;

// Namespace in comments (should be ignored)
// namespace fake_in_comment { }

// Namespace in string literal (should be ignored)
// const char* str = "namespace not_real { }";

// ============================================================================
// SUMMARY OF NAMESPACE DEFINITION PATTERNS TO DETECT:
// ============================================================================
// 1. namespace NAME { }
// 2. namespace NAME1::NAME2 { }                    (C++17)
// 3. namespace { }                                  (anonymous)
// 4. inline namespace NAME { }                      (C++11)
// 5. namespace [[attributes]] NAME { }              (C++17)
// 6. namespace ALIAS = TARGET;                      (alias)
// 7. Any combination of the above
// 8. Reopening: same namespace name appearing multiple times
// ============================================================================